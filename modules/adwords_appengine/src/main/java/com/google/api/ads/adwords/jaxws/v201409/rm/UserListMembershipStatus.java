
package com.google.api.ads.adwords.jaxws.v201409.rm;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for UserListMembershipStatus.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="UserListMembershipStatus">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="OPEN"/>
 *     &lt;enumeration value="CLOSED"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "UserListMembershipStatus")
@XmlEnum
public enum UserListMembershipStatus {


    /**
     * 
     *                 Open status - list is accruing members and can be targeted to.
     *               
     * 
     */
    OPEN,

    /**
     * 
     *                 Closed status - No new members being added. Can not be used for targeting.
     *               
     * 
     */
    CLOSED;

    public String value() {
        return name();
    }

    public static UserListMembershipStatus fromValue(String v) {
        return valueOf(v);
    }

}
