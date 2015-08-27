package hashads.domain.advert;

import java.io.Serializable;
import java.util.Date;
import java.util.Map;

/**
 * Created by hashcode on 2015/08/25.
 */
public class Advert implements Serializable {
    private String id;
    private Date startDate;
    private String owenerId;
    private String categoryId;
    private Map<String, String> imagesurls;
}
