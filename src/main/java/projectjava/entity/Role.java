package projectjava.entity;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by user on 12/4/2016.
 */

@Entity
@Table(name="roles")
public class Role {

    private Integer id;
    private String name;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Column(name="name", nullable = false)
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private Set<User> users;

    @ManyToMany(mappedBy = "roles")
    public Set<User> getUsers() {
        return users;
    }

    public void setUsers(Set<User> users) {
        this.users = users;
    }

    public Role(){
        this.users = new HashSet<>();
    }
 }
