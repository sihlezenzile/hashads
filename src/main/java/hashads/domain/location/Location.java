package hashads.domain.location;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by hashcode on 2015/08/25.
 */
public class Location implements Serializable {
    private String id;
    private String name;
    private String  locationTypeId;
    private String latitude;
    private String longitude;
    private String parentId;
    private List<String> childrenId = new ArrayList<>();

}
