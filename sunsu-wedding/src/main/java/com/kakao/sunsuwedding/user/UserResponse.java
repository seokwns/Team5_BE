package com.kakao.sunsuwedding.user;

import com.kakao.sunsuwedding.user.base_user.User;
import com.kakao.sunsuwedding.user.constant.Role;
import lombok.Getter;
import lombok.Setter;

import java.time.format.DateTimeFormatter;

public class UserResponse {
    @Getter
    @Setter
    public static class FindById{
        private Long userId;
        private String username;
        private String email;
        private String role;
        private String grade;
        private String payedAt;

        public FindById(User user) {
            this.userId = user.getId();
            this.username = user.getUsername();
            this.email = user.getEmail();
            this.role = user.getDtype();
            this.grade = user.getGrade().getGradeName();
            this.payedAt = (user.getPayed_at() == null) ? null : user.getPayed_at().format(DateTimeFormatter.ofPattern("yyyy년 MM월 dd일"));
        }
    }
}
