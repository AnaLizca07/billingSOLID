package com.billing.mappers;

import com.billing.domain.factory.ProductFactory;
import com.billing.domain.model.Invoice;
import com.billing.domain.model.Product;
import com.billing.dtos.InvoiceDTO;
import com.billing.dtos.ProductDTO;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.stream.Collectors;
/**
 * This class is responsible for mapping domain objects to data transfer objects (DTOs) and vice versa.
 * It uses the ProductFactory to create Product instances.
 * @author Ana Lizcano
 * @since 1.0
 */
@Component
@RequiredArgsConstructor
public class BillingMapper {
    private final ProductFactory productFactory;

    /**
     * Maps a ProductDTO to a Product instance.
     *
     * @param dto The ProductDTO to be mapped.
     * @return The mapped Product instance.
     */
    public Product toProduct(ProductDTO dto) {
        return productFactory.createProduct(
                dto.getCategory(),
                dto.getName(),
                dto.getPrice()
        );
    }

    /**
     * Maps a Product instance to a ProductDTO.
     *
     * @param product The Product instance to be mapped.
     * @return The mapped ProductDTO.
     */
    public ProductDTO toProductDTO(Product product) {
        ProductDTO dto = new ProductDTO();
        dto.setName(product.getName());
        dto.setPrice(product.getPrice());
        dto.setCategory(product.getCategory());
        return dto;
    }

    /**
     * Maps an Invoice instance to an InvoiceDTO.
     *
     * @param invoice The Invoice instance to be mapped.
     * @return The mapped InvoiceDTO.
     */
    public InvoiceDTO toInvoiceDTO(Invoice invoice) {
        InvoiceDTO dto = new InvoiceDTO();
        dto.setInvoiceNumber(invoice.getInvoiceNumber());
        dto.setDateTime(invoice.getDateTime());
        dto.setProductDTOList(invoice.getProducts().stream()
                .map(this::toProductDTO)
                .collect(Collectors.toList()));
        dto.setTotalAmount(invoice.getTotalAmount());
        dto.setTotalTax(invoice.getTotalTax());
        dto.setFinalAmount(invoice.getFinalAmount());
        return dto;
    }
}
