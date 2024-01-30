package rvt;

public class Money {

    private final int euros;
    private final int cents;

    public Money(int euros, int cents) {
        this.euros = euros;
        this.cents = cents;
    }

    public int euros() {
        return euros;
    }

    public int cents() {
        return cents;
    }

    public String toString() {
        String zero = "";
        if (cents <= 10) {
            zero = "0";
        }

        return euros + "." + zero + cents + "e";
    }



public Money plus(Money addition) {
    int euros = this.euros + addition.euros;
    int cents = this.cents + addition.cents;

    if (cents > 100) {
        cents -= 100;
        euros++;
    }

    return new Money(euros, cents);
}


public boolean lessThan(Money compared) {
    // if the euros are not the same
    if (this.euros < compared.euros) {
        return true;
    }

    // if the euros were not less than the euros of the compared, compare cents
    if (this.euros == compared.euros && this.cents < compared.cents) {
        return true;
    }

    // otherwise
    return false;
}

// Write the method public Money minus(Money decreaser)
public Money minus(Money decreaser) {
        int euros = this.euros - decreaser.euros;
        int cents = this.cents - decreaser.cents;

        if (cents < 0) {
            cents = 0;
            euros--;
        }

        if (euros < 0) {
            euros = 0;
            cents = 0;
        }

        return new Money(euros, cents);
}

}

