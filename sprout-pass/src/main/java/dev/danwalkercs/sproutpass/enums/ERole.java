package dev.danwalkercs.sproutpass.enums;

public enum ERole {

    ADMIN(1L),
    USER(2L),
    READ_ONLY(3L);

    private final long roleId;

    ERole(long roleId) {
        this.roleId = roleId;
    }

    public long roleId() {
        return roleId;
    }
}
