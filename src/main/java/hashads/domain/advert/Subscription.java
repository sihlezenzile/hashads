package hashads.domain.advert;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * Created by hashcode on 2015/08/25.
 */
public class Subscription  implements Serializable {
    private String id;
    private BigDecimal price;
    private Date startDate;
    private Date endDate;
    private String description;
}
