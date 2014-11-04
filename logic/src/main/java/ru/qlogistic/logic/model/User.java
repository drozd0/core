package ru.qlogistic.logic.model;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Collection;
import java.util.Date;
import java.util.Set;

@Entity
@Table(name = "users")
public class User implements UserDetails, Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "user_id")
    private Long id;
    @Column(name = "username")
    private String username;
    @Column(name = "password")
    private String password;
    @Column(name = "telephone_number")
    private String telephoneNumber;
    @Column(name = "checked_telephone")
    private boolean checkedPhone;
    @Column(name = "purse_number")
    private String purseNumber;
    @Column(name = "avatar")
    private String avatar;
    @OneToMany(fetch = FetchType.EAGER, mappedBy = "user", cascade = {CascadeType.PERSIST, CascadeType.MERGE, CascadeType.REMOVE})
    private Set<Photo> idCardPhoto;
    @Column(name = "reg_token")
    private String registrationToken;
    @Column(name = "reg_time")
    @Temporal(TemporalType.TIMESTAMP)
    private Date registrationTime;
    @ManyToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinTable(name = "user_role",
            joinColumns = {@JoinColumn(name = "user_id", referencedColumnName = "user_id")},
            inverseJoinColumns = {@JoinColumn(name = "role_id", referencedColumnName = "role_id")})
    private Set<Role> roles;
    @Column(name = "checked")
    private boolean checked;
    @OneToMany(fetch = FetchType.EAGER)
    @JoinColumn(name = "sender_id")
    private Set<Order> sentOrders;
    @OneToMany(fetch = FetchType.EAGER)
    @JoinColumn(name = "receiver_id")
    private Set<Order> receivedOrders;
    @OneToMany(fetch = FetchType.EAGER)
    @JoinColumn(name = "courier_id")
    private Set<Order> deliveredOrders;

    public Long getId() {
        return id;
    }

    public String getUsername() {
        return username;
    }

    @Override
    public boolean isAccountNonExpired() {
        return false;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public boolean isAccountNonLocked() {
        return false;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return false;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public boolean isEnabled() {
        return false;  //To change body of implemented methods use File | Settings | File Templates.
    }

    public void setUsername(String username) {
        this.username = username;
    }

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return roles;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getTelephoneNumber() {
        return telephoneNumber;
    }

    public void setTelephoneNumber(String telephoneNumber) {
        this.telephoneNumber = telephoneNumber;
    }

    public String getPurseNumber() {
        return purseNumber;
    }

    public void setPurseNumber(String purseNumber) {
        this.purseNumber = purseNumber;
    }

    public Set<Photo> getIdCardPhoto() {
        return idCardPhoto;
    }

    public void setIdCardPhoto(Set<Photo> idCardPhoto) {
        this.idCardPhoto = idCardPhoto;
    }

    public String getRegistrationToken() {
        return registrationToken;
    }

    public void setRegistrationToken(String registrationToken) {
        this.registrationToken = registrationToken;
    }

    public Date getRegistrationTime() {
        return registrationTime;
    }

    public void setRegistrationTime(Date registrationTime) {
        this.registrationTime = registrationTime;
    }

    public Set<Role> getRoles() {
        return roles;
    }

    public void setRoles(Set<Role> roles) {
        this.roles = roles;
    }

    public boolean isChecked() {
        return checked;
    }

    public void setChecked(boolean checked) {
        this.checked = checked;
    }

    public boolean isCheckedPhone() {
        return checkedPhone;
    }

    public void setCheckedPhone(boolean checkedPhone) {
        this.checkedPhone = checkedPhone;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    public Set<Order> getSentOrders() {
        return sentOrders;
    }

    public void setSentOrders(Set<Order> sentOrders) {
        this.sentOrders = sentOrders;
    }

    public Set<Order> getReceivedOrders() {
        return receivedOrders;
    }

    public void setReceivedOrders(Set<Order> receivedOrders) {
        this.receivedOrders = receivedOrders;
    }

    public Set<Order> getDeliveredOrders() {
        return deliveredOrders;
    }

    public void setDeliveredOrders(Set<Order> deliveredOrders) {
        this.deliveredOrders = deliveredOrders;
    }

    @Override
    public String toString() {
        return "User{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", registrationToken='" + registrationToken + '\'' +
                ", registrationTime=" + registrationTime +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        User user = (User) o;

        if (id != null ? !id.equals(user.id) : user.id != null) return false;
        if (!username.equals(user.username)) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + username.hashCode();
        return result;
    }
}
