package com.eltex.data;

import org.jetbrains.annotations.Nullable;

public record UserResponse(
        long id,
        String login,
        String name,
        @Nullable
        String avatar
) {
    public Builder builder() {
        return new Builder(id, login, name)
                .setId(id)
                .setLogin(login)
                .setName(name)
                .setAvatar(avatar);
    }

    static class Builder {
        private long id;
        private String login;
        private String name;
        private String avatar;

        public Builder(
                final long id,
                final String login,
                final String name
        ) {
            this.id = id;
            this.login = login;
            this.name = name;
        }

        public UserResponse.Builder setId(final long id) {
            this.id = id;
            return this;
        }

        public UserResponse.Builder setLogin(final String login) {
            this.login = login;
            return this;
        }

        public UserResponse.Builder setName(final String name) {
            this.name = name;
            return this;
        }

        public UserResponse.Builder setAvatar(final String avatar) {
            this.avatar = avatar;
            return this;
        }

        public UserResponse build() {
            return new UserResponse(
                    id,
                    login,
                    name,
                    avatar
            );
        }

    }
}
