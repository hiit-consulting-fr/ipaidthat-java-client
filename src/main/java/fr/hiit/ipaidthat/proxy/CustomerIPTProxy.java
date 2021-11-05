package fr.hiit.ipaidthat.proxy;

import fr.hiit.ipaidthat.proxy.model.Customer;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@FeignClient(url = "https://ipaidthat.io/inv/api/v2/customers", name = "IPaidThat-api-customer")
public interface CustomerIPTProxy {

    @GetMapping
    List<Customer> findAll();

    @GetMapping("/{id}/")
    Customer findById(@PathVariable("id") Long id);

    @GetMapping
    List<Customer> findByExternalId(@RequestParam("external_id") Long externalId);
}
