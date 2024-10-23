package com.eltex.data;

import java.util.ArrayList;
import java.util.List;

public class UserService {
    private long nextId = 1L;
    private final List<UserResponse> users = new ArrayList<>();

    public void save(final UserResponse user) {
        if (user.id() == 0) {
            users.add(
                    new UserResponse.Builder(nextId++, user.login(), user.name())
                            .setAvatar(user.avatar())
                            .build()
            );
        } else {
            for (int i = 0; i < users.size(); i++) {
                if (user.id() == users.get(i).id()) {
                    users.set(i, new UserResponse.Builder(user.id(), user.login(), user.name())
                            .setAvatar(user.avatar())
                            .build()
                    );
                }
            }
        }
    }

    public void removeById(final long userId) {
        users.removeIf(userResponse -> userId == userResponse.id());
    }

    public UserResponse getById(final long userId) {
        for (final UserResponse userResponse : users) {
            if (userId == userResponse.id()) {
                return userResponse;
            }
        }
        throw new NotFoundException("User with given id not found");
    }

    public List getAll() {
        return users;
    }
}
