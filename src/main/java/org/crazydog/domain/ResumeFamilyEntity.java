package org.crazydog.domain;

import javax.persistence.*;

/**
 * Created by never on 2015/8/23.
 */
@Entity
@Table(name = "resume_family", schema = "", catalog = "crazydog")
public class ResumeFamilyEntity {
    private Integer id;
    private String name;
    private String relationship;
    private String department;
    private ResumeEntity resumeByResumeId;

    @Id
    @Column(name = "id", nullable = false, insertable = true, updatable = true)
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }


    @Basic
    @Column(name = "name", nullable = false, insertable = true, updatable = true, length = 10)
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Basic
    @Column(name = "relationship", nullable = false, insertable = true, updatable = true, length = 10)
    public String getRelationship() {
        return relationship;
    }

    public void setRelationship(String relationship) {
        this.relationship = relationship;
    }

    @Basic
    @Column(name = "department", nullable = false, insertable = true, updatable = true, length = 30)
    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ResumeFamilyEntity that = (ResumeFamilyEntity) o;

        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        if (name != null ? !name.equals(that.name) : that.name != null) return false;
        if (relationship != null ? !relationship.equals(that.relationship) : that.relationship != null) return false;
        if (department != null ? !department.equals(that.department) : that.department != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (relationship != null ? relationship.hashCode() : 0);
        result = 31 * result + (department != null ? department.hashCode() : 0);
        return result;
    }

    @ManyToOne
    @JoinColumn(name = "resume_id", referencedColumnName = "id", nullable = false)
    public ResumeEntity getResumeByResumeId() {
        return resumeByResumeId;
    }

    public void setResumeByResumeId(ResumeEntity resumeByResumeId) {
        this.resumeByResumeId = resumeByResumeId;
    }
}
