package fr.hiit.ipaidthat.proxy;

import fr.hiit.ipaidthat.proxy.dto.InvoiceIPaidThatDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@FeignClient(url = "https://ipaidthat.io/inv/api/v2/invoices", name = "IPaidThat-api-invoice")
public interface InvoiceIPTProxy {

    @GetMapping("/")
    List<InvoiceIPaidThatDto> findAll();

    @PostMapping("/")
    InvoiceIPaidThatDto create(@RequestBody InvoiceIPaidThatDto invoice);

    @GetMapping("/{id}/")
    InvoiceIPaidThatDto findById(@PathVariable("id") Long id);

    @PutMapping("/{id}/")
    InvoiceIPaidThatDto update(@PathVariable("id") Long id, @RequestBody InvoiceIPaidThatDto invoice);

    @DeleteMapping("/{id}/")
    ResponseEntity<Void> delete(@PathVariable("id") Long id);

    @GetMapping("/{id}/to_pdf/")
    ResponseEntity<Void> getPdf(@PathVariable("id") Long id);

    @PostMapping("/{id}/validate/")
    Boolean validate(@PathVariable("id") Long id, @RequestBody Boolean sendEmail);
}
