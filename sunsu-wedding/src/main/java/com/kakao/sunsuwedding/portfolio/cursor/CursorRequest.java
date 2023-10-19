package com.kakao.sunsuwedding.portfolio.cursor;

public record CursorRequest(
        Long key,
        int size,
        String name,
        String location,
        Long minPrice,
        Long maxPrice
) {
    public static final Long NONE_KEY = -2L;
    public static final Long START_KEY = -1L;

    public Boolean hasKey() {
        return key != null && !key.equals(NONE_KEY) && key > NONE_KEY;
    }

    public CursorRequest next(Long nextKey) {
        return new CursorRequest(nextKey, size, name, location, minPrice, maxPrice);
    }
}
