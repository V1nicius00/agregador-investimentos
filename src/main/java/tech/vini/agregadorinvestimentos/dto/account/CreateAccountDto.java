package tech.vini.agregadorinvestimentos.dto.account;

public record CreateAccountDto(
        String description,
        String street,
        Integer number
) {
}
