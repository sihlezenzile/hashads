package hashads.domain.people;

import java.io.Serializable;

/**
 * Created by hashcode on 2015/08/25.
 */
public class User implements Serializable {
    private String emailadress;
    private String password;
    private String phonenumber;
    private boolean enabled;
    private String token;
}
