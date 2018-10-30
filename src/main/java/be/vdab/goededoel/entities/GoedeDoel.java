package be.vdab.goededoel.entities;

import java.math.BigDecimal;


/**
 * Een <strong>goed doel</strong> waarvoor men geld inzamelt
 * @author kenneth.vangijsel
 */
public class GoedeDoel {
    private final String naam;
    private BigDecimal opgebracht = BigDecimal.ZERO;

    /**
     * Maakt een GoedeDoel object.
     * @param naam De naam van het goede doel.
     */
    public GoedeDoel(String naam) {
        this.naam = naam;
    }

    /**
     * Geeft de naam terug
     * @return de naam
     */
    public String getNaam() {
        return naam;
    }

    /**
     * Geeft terug hoeveel &euro; dit doel heeft opgebracht
     * @return het opgebracht bedrag
     */
    public BigDecimal getOpgebracht() {
        return opgebracht;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof GoedeDoel)) return false;

        GoedeDoel goedeDoel = (GoedeDoel) o;

        return naam.equalsIgnoreCase(goedeDoel.naam);
    }

    @Override
    public int hashCode() {
        return naam.hashCode();
    }
}
