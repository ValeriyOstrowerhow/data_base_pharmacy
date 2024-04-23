//package de.aittr.data_base_pharmacy.model;
//
//import jakarta.persistence.*;
//import org.springframework.security.core.GrantedAuthority;
//import org.springframework.security.core.authority.SimpleGrantedAuthority;
//import org.springframework.security.core.userdetails.UserDetails;
//import java.util.Collection;
//import java.util.Set;
//import java.util.stream.Collectors;
//
//@Entity
//@Table(name = "user")
//public class User implements UserDetails
//{
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    @Column(name = "id")
//    private int id;
//    @Column(name = "username")
//    private String username;
//    @Column(name = "password")
//    private String password;
//    @ManyToMany
//    @JoinTable(
//            name = "user_role",
//            joinColumns = @JoinColumn
//                    (name = "id_user"),
//            inverseJoinColumns =
//            @JoinColumn(name = "role_id")
//    )
//    private Set<User> roles;
//
//    @Override
//    public Collection<? extends GrantedAuthority> getAuthorities() {
//        return roles.stream()
//                .map(role -> new SimpleGrantedAuthority(role()))
//                .collect(Collectors.toList());
//    }
//
//    @Override
//    public String getPassword() {
//        return "password";
//    }
//
//    @Override
//    public String getUsername() {
//        return "username";
//    }
//
//    @Override
//    public boolean isAccountNonExpired() {
//        return false;
//    }
//
//    @Override
//    public boolean isAccountNonLocked() {
//        return false;
//    }
//
//    @Override
//    public boolean isCredentialsNonExpired() {
//        return false;
//    }
//
//    @Override
//    public boolean isEnabled() {
//        return false;
//    }
//}













































