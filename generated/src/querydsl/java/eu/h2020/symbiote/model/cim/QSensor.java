package eu.h2020.symbiote.model.cim;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QSensor is a Querydsl query type for Sensor
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QSensor extends EntityPathBase<Sensor> {

    private static final long serialVersionUID = -271653670L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QSensor sensor = new QSensor("sensor");

    public final QDevice _super;

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

    public final ListPath<String, StringPath> observesProperty = this.<String, StringPath>createList("observesProperty", String.class, StringPath.class, PathInits.DIRECT2);

    //inherited
    public final ListPath<Service, QService> services;

    public QSensor(String variable) {
        this(Sensor.class, forVariable(variable), INITS);
    }

    public QSensor(Path<? extends Sensor> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QSensor(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QSensor(PathMetadata metadata, PathInits inits) {
        this(Sensor.class, metadata, inits);
    }

    public QSensor(Class<? extends Sensor> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this._super = new QDevice(type, metadata, inits);
        this.description = _super.description;
        this.id = _super.id;
        this.interworkingServiceURL = _super.interworkingServiceURL;
        this.locatedAt = _super.locatedAt;
        this.name = _super.name;
        this.services = _super.services;
    }

}

