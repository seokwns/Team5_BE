package com.kakao.sunsuwedding.payment;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotEmpty;

public class PaymentRequest {
    public record SaveDTO(
        @NotEmpty(message = "orderId는 비어있으면 안됩니다.")
        String orderId,

        @NotEmpty(message = "paymentKey는 비어있으면 안됩니다.")
        String paymentKey,

        @Min(value = 0, message = "금액은 양수여야 합니다.")
        Long amount
    ) {}

    public record ConfirmDTO(
        @NotEmpty(message = "orderId는 비어있으면 안됩니다.")
        String orderId,

        @NotEmpty(message = "paymentKey는 비어있으면 안됩니다.")
        String paymentKey,

        @Min(value = 0, message = "금액은 양수여야 합니다.")
        Long amount
    ) {}

    public record UpgradeDTO(
        @NotEmpty(message = "orderId는 비어있으면 안됩니다.")
        String orderId,

        @NotEmpty(message = "paymentKey는 비어있으면 안됩니다.")
        String paymentKey,

        @NotEmpty(message = "상태값은 비어있으면 안됩니다.")
        String status,

        @Min(value = 0, message = "금액은 양수여야 합니다.")
        Long amount
    ) {}
}
