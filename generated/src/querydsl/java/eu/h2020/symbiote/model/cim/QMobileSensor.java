package eu.h2020.symbiote.model.cim;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QMobileSensor is a Querydsl query type for MobileSensor
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QMobileSensor extends EntityPathBase<MobileSensor> {

    private static final long serialVersionUID = -2032498660L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QMobileSensor mobileSensor = new QMobileSensor("mobileSensor");

    public final QSensor _super;

    //inherited
    public final ListPath<String, StringPath> description;

    //inherited
    public final StringPath id;

    //inherited
    public final StringPath interworkingServiceURL;

    // inherited
    public final QLocation locatedAt;

    //inherited
    public final StringPath name;

    //inherited
    public final ListPath<String, StringPath> observesProperty;

    //inherited
    public final ListPath<Service, QService> services;

    public QMobileSensor(String variable) {
        this(MobileSensor.class, forVariable(variable), INITS);
    }

    public QMobileSensor(Path<? extends MobileSensor> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QMobileSensor(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QMobileSensor(PathMetadata metadata, PathInits inits) {
        this(MobileSensor.class, metadata, inits);
    }

    public QMobileSensor(Class<? extends MobileSensor> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this._super = new QSensor(type, metadata, inits);
        this.description = _super.description;
        this.id = _super.id;
        this.interworkingServiceURL = _super.interworkingServiceURL;
        this.locatedAt = _super.locatedAt;
        this.name = _super.name;
        this.observesProperty = _super.observesProperty;
        this.services = _super.services;
    }

}

