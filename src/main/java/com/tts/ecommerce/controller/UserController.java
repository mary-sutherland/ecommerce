package com.tts.ecommerce.controller;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.Transient;


import java.util.Collection;

public class UserController {

    //UserDetails requires these, they are technically getters (is-era?) overridden by Lombok.
    // @Transient Makes it so these aren't persisted in the database, as they are hard coded

    @Transient
    private boolean accountNonExpired = true;
    @Transient
    private boolean accountNonLocked = true;
    @Transient
    private boolean credentialsNonExpired = true;
    @Transient
    private boolean enabled = true;
    @Transient
    private Collection<GrantedAuthority> authorities = null;

}
