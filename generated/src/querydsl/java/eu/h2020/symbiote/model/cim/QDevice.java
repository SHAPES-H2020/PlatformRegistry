package eu.h2020.symbiote.model.cim;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QDevice is a Querydsl query type for Device
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QDevice extends EntityPathBase<Device> {

    private static final long serialVersionUID = -700862602L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QDevice device = new QDevice("device");

    public final QResource _super = new QResource(this);

    //inherited
    public final ListPath<String, StringPath> description = _super.description;

    //inherited
    public final StringPath id = _super.id;

    //inherited
    public final StringPath interworkingServiceURL = _super.interworkingServiceURL;

    public final QLocation locatedAt;

    //inherited
    public final StringPath name = _super.name;

    public final ListPath<Service, QService> services = this.<Service, QService>createList("services", Service.class, QService.class, PathInits.DIRECT2);

    public QDevice(String variable) {
        this(Device.class, forVariable(variable), INITS);
    }

    public QDevice(Path<? extends Device> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QDevice(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QDevice(PathMetadata metadata, PathInits inits) {
        this(Device.class, metadata, inits);
    }

    public QDevice(Class<? extends Device> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.locatedAt = inits.isInitialized("locatedAt") ? new QLocation(forProperty("locatedAt")) : null;
    }

}

