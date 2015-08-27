package hashads.domain.advert;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by hashcode on 2015/08/25.
 */
public class Category implements Serializable {
    private String id;
    private List<String> children = new ArrayList<>();
    private String categoryId;
    private String name;
}
