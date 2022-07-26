package eu.h2020.symbiote.model.cim;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;


/**
 * QWKTLocation is a Querydsl query type for WKTLocation
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QWKTLocation extends EntityPathBase<WKTLocation> {

    private static final long serialVersionUID = -743387435L;

    public static final QWKTLocation wKTLocation = new QWKTLocation("wKTLocation");

    public final QLocation _super = new QLocation(this);

    //inherited
    public final ListPath<String, StringPath> description = _super.description;

    //inherited
    public final StringPath name = _super.name;

    public final StringPath value = createString("value");

    public QWKTLocation(String variable) {
        super(WKTLocation.class, forVariable(variable));
    }

    public QWKTLocation(Path<? extends WKTLocation> path) {
        super(path.getType(), path.getMetadata());
    }

    public QWKTLocation(PathMetadata metadata) {
        super(WKTLocation.class, metadata);
    }

}

