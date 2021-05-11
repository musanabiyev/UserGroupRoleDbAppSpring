package com.company.entity;

import javax.persistence.*;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;
import java.io.Serializable;
import java.util.List;

/**
 * @author M
 */
@Entity
@Table(name = "groups")
@XmlRootElement
@NamedQueries({
        @NamedQuery(name = "Groups.findAll", query = "SELECT g FROM Groups g"),
        @NamedQuery(name = "Groups.findById", query = "SELECT g FROM Groups g WHERE g.id = :id"),
        @NamedQuery(name = "Groups.findByName", query = "SELECT g FROM Groups g WHERE g.name = :name")})
public class Groups implements Serializable {

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "groupId")
    private List<GroupRole> groupRoleList;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "groupId")
    private List<GroupUser> groupUserList;

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Column(name = "name")
    private String name;

    public Groups() {
    }

    public Groups(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Groups)) {
            return false;
        }
        Groups other = (Groups) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.Groups[ id=" + id + " ]";
    }

    @XmlTransient
    public List<GroupUser> getGroupUserList() {
        return groupUserList;
    }

    public void setGroupUserList(List<GroupUser> groupUserList) {
        this.groupUserList = groupUserList;
    }

    @XmlTransient
    public List<GroupRole> getGroupRoleList() {
        return groupRoleList;
    }

    public void setGroupRoleList(List<GroupRole> groupRoleList) {
        this.groupRoleList = groupRoleList;
    }

}
