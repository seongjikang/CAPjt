package kang.clean.domain;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Value;

@AllArgsConstructor(access = AccessLevel.PRIVATE)
@Getter
public class Account {
    private  final AccountId id;

    private final Money baselineBalance;

    private final ActivityWindow activityWindow;

    @Value
    public static class AccountId {
        private Long value;
    }
}
