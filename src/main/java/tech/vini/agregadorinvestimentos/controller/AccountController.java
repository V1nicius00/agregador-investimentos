package tech.vini.agregadorinvestimentos.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import tech.vini.agregadorinvestimentos.dto.account.AccountStockResponseDto;
import tech.vini.agregadorinvestimentos.dto.account.AssociateAccountStockDto;
import tech.vini.agregadorinvestimentos.dto.account.CreateAccountDto;
import tech.vini.agregadorinvestimentos.dto.stock.CreateStockDto;
import tech.vini.agregadorinvestimentos.service.AccountService;

import java.util.List;

@RestController
@RequestMapping("/accounts")
public class AccountController {

    private final AccountService accountService;

    public AccountController(AccountService accountService) {
        this.accountService = accountService;
    }

    @PostMapping("/{accountId}/stocks")
    public ResponseEntity<Void> associateStock(@PathVariable("accountId") String accountId,
                                              @RequestBody AssociateAccountStockDto associateAccountStockDto){
        accountService.associateStock(accountId, associateAccountStockDto);
        return ResponseEntity.ok().build();
    }

    @GetMapping("/{accountId}/stocks")
    public ResponseEntity<List<AccountStockResponseDto>> listStocks(@PathVariable("accountId") String accountId){
        var stocks = accountService.listStocks(accountId);
        return ResponseEntity.ok(stocks);
    }
}
