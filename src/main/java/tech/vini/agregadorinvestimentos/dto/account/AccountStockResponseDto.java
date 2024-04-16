package tech.vini.agregadorinvestimentos.dto.account;

public record AccountStockResponseDto(
        String stockId,
        int quantity,
        double total
) {
}
