package tech.vini.agregadorinvestimentos.dto.user;

public record CreateUserDto(
        String username,
        String email,
        String password
) {
}
