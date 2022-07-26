package eu.h2020.symbiote.model.cim;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QActuator is a Querydsl query type for Actuator
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QActuator extends EntityPathBase<Actuator> {

    private static final long serialVersionUID = -1973783783L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QActuator actuator = new QActuator("actuator");

    public final QDevice _super;

    public final ListPath<Capability, QCapability> capabilities = this.<Capability, QCapability>createList("capabilities", Capability.class, QCapability.class, PathInits.DIRECT2);

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
    public final ListPath<Service, QService> services;

    public QActuator(String variable) {
        this(Actuator.class, forVariable(variable), INITS);
    }

    public QActuator(Path<? extends Actuator> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QActuator(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QActuator(PathMetadata metadata, PathInits inits) {
        this(Actuator.class, metadata, inits);
    }

    public QActuator(Class<? extends Actuator> type, PathMetadata metadata, PathInits inits) {
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

