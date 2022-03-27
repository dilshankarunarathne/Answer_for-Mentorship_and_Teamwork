package me.karunarathne.HashCode22;

import java.util.Objects;

public class Role {
    private Skill required_skill ;
    private int level ;

    public Role(Skill required_skill, int level) {
        this.required_skill = required_skill;
        this.level = level;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Role)) return false;
        Role role = (Role) o;
        return level == role.level && required_skill == role.required_skill;
    }

    @Override
    public int hashCode() {
        return Objects.hash(required_skill, level);
    }
}
