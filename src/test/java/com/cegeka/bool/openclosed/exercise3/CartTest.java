package com.cegeka.bool.openclosed.exercise3;

import com.cegeka.bool.openclosed.exercise3.products.Appel;
import com.cegeka.bool.openclosed.exercise3.products.Peer;
import org.assertj.core.api.Assertions;
import org.junit.Before;
import org.junit.Test;

public class CartTest {

    private Cart cart;

    @Before
    public void setUp() throws Exception {
        this.cart = new Cart();
    }

    @Test
    public void testAppelPeer() {
        cart.addItem(new Appel());
        cart.addItem(new Peer());

        Assertions.assertThat(cart.calculateTotalPrice()).isEqualTo(1.5);
    }

    @Test
    public void testAppelPeerBanaan(){
        cart.addItem(new Appel());
        cart.addItem(new Peer());
        //Add 2 bananen: prijs = 1/banaan MAAR bananen zijn in promo: "2 halen, 1 betalen"

        Assertions.assertThat(cart.calculateTotalPrice()).isEqualTo(2.5);
    }
}