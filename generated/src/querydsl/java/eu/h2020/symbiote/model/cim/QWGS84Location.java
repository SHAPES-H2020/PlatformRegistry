package eu.h2020.symbiote.model.cim;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;


/**
 * QWGS84Location is a Querydsl query type for WGS84Location
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QWGS84Location extends EntityPathBase<WGS84Location> {

    private static final long serialVersionUID = 662049172L;

    public static final QWGS84Location wGS84Location = new QWGS84Location("wGS84Location");

    public final QLocation _super = new QLocation(this);

    public final NumberPath<Double> altitude = createNumber("altitude", Double.class);

    //inherited
    public final ListPath<String, StringPath> description = _super.description;

    public final NumberPath<Double> latitude = createNumber("latitude", Double.class);

    public final NumberPath<Double> longitude = createNumber("longitude", Double.class);

    //inherited
    public final StringPath name = _super.name;

    public QWGS84Location(String variable) {
        super(WGS84Location.class, forVariable(variable));
    }

    public QWGS84Location(Path<? extends WGS84Location> path) {
        super(path.getType(), path.getMetadata());
    }

    public QWGS84Location(PathMetadata metadata) {
        super(WGS84Location.class, metadata);
    }

}

