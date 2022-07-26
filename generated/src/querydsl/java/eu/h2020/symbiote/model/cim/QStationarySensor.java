package eu.h2020.symbiote.model.cim;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QStationarySensor is a Querydsl query type for StationarySensor
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QStationarySensor extends EntityPathBase<StationarySensor> {

    private static final long serialVersionUID = 1233063598L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QStationarySensor stationarySensor = new QStationarySensor("stationarySensor");

    public final QSensor _super;

    //inherited
    public final ListPath<String, StringPath> description;

    public final QFeatureOfInterest featureOfInterest;

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

    public QStationarySensor(String variable) {
        this(StationarySensor.class, forVariable(variable), INITS);
    }

    public QStationarySensor(Path<? extends StationarySensor> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QStationarySensor(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QStationarySensor(PathMetadata metadata, PathInits inits) {
        this(StationarySensor.class, metadata, inits);
    }

    public QStationarySensor(Class<? extends StationarySensor> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this._super = new QSensor(type, metadata, inits);
        this.description = _super.description;
        this.featureOfInterest = inits.isInitialized("featureOfInterest") ? new QFeatureOfInterest(forProperty("featureOfInterest")) : null;
        this.id = _super.id;
        this.interworkingServiceURL = _super.interworkingServiceURL;
        this.locatedAt = _super.locatedAt;
        this.name = _super.name;
        this.observesProperty = _super.observesProperty;
        this.services = _super.services;
    }

}

