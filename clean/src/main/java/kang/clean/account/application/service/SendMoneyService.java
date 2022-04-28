package kang.clean.account.application.service;

import kang.clean.account.application.port.out.AccountLock;
import kang.clean.account.application.port.out.LoadAccountPort;
import kang.clean.account.application.poort.in.SendMoneyCommand;
import kang.clean.account.application.poort.in.SendMoneyUseCase;
import kang.clean.account.application.port.out.UpdateAccountSatePort;
import kang.clean.common.UseCase;
import lombok.RequiredArgsConstructor;

import javax.transaction.Transactional;

@RequiredArgsConstructor
@UseCase
@Transactional
public class SendMoneyService implements SendMoneyUseCase {

    private final LoadAccountPort loadAccountPort;
    private final AccountLock accountLock;
    private final UpdateAccountSatePort updateAccountSatePort;
    private final MoneyTransferProperties moneyTransferProperties;

    @Override
    public boolean SendMoney(SendMoneyCommand command) {
        return false;
    }
}
