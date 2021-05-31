package fr.hiit.ipaidthat.proxy;

import fr.hiit.ipaidthat.proxy.dto.CustomerIPaidThatDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@FeignClient(url = "https://ipaidthat.io/inv/api/v2/customers", name = "IPaidThat-api-customer")
public interface CustomerIPTProxy {

    @GetMapping
    List<CustomerIPaidThatDto> findAll();

    @GetMapping("/{id}/")
    CustomerIPaidThatDto findById(@PathVariable Long id);

    @GetMapping
    List<CustomerIPaidThatDto> findByExternalId(@RequestParam("external_id") Long externalId);
}
