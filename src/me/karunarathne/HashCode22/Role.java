package me.karunarathne.HashCode22;

import java.util.Objects;

class Role {
    private final String required_skill ;
    private final int level ;

    Contributor assignedContributor ;

    public Role(String required_skill, int level) {
        this.required_skill = required_skill;
        this.level = level;
    }

    public Contributor getAssignedContributor() {
        return assignedContributor;
    }

    public void setAssignedContributor(Contributor assignedContributor) {
        this.assignedContributor = assignedContributor;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Role role)) return false;

        return level == role.level && required_skill.equals(role.required_skill) ;
    }

    @Override
    public int hashCode() {
        return Objects.hash(required_skill, level);
    }

    public String getRequired_skill() {
        return required_skill;
    }
    public int getLevel() {
        return level;
    }
}
