package fr.hiit.ipaidthat.proxy;

import fr.hiit.ipaidthat.proxy.dto.InvoiceSimpleItemIPTDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@FeignClient(url = "https://ipaidthat.io/inv/api/v2/invoicesimpleitems", name = "IPaidThat-api-invoiceSimpleItem")
public interface InvoiceSimpleItemIPTProxy {

    @GetMapping("/")
    List<InvoiceSimpleItemIPTDto> findAll();

    @GetMapping("/{id}")
    InvoiceSimpleItemIPTDto findById(@PathVariable Long id);

    @GetMapping("")
    List<InvoiceSimpleItemIPTDto> findAllByInvoiceId(@RequestParam("invoice") Long invoiceId);

    @PostMapping("/")
    InvoiceSimpleItemIPTDto create(@RequestBody InvoiceSimpleItemIPTDto invoiceSimpleItem);

    @PutMapping("/{id}")
    InvoiceSimpleItemIPTDto update(@PathVariable Long id, @RequestBody InvoiceSimpleItemIPTDto invoiceSimpleItem);

    @DeleteMapping("/{id}")
    ResponseEntity<Void> delete(@PathVariable Long id);
}
