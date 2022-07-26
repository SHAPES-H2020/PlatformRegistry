package eu.h2020.symbiote.cloud.model.internal;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QFederatedResource is a Querydsl query type for FederatedResource
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QFederatedResource extends EntityPathBase<FederatedResource> {

    private static final long serialVersionUID = -2142764365L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QFederatedResource federatedResource = new QFederatedResource("federatedResource");

    public final NumberPath<Double> adaptiveTrust = createNumber("adaptiveTrust", Double.class);

    public final StringPath aggregationId = createString("aggregationId");

    public final QCloudResource cloudResource;

    public final MapPath<String, FederatedResourceInfo, QFederatedResourceInfo> federatedResourceInfoMap = this.<String, FederatedResourceInfo, QFederatedResourceInfo>createMap("federatedResourceInfoMap", String.class, FederatedResourceInfo.class, QFederatedResourceInfo.class);

    public final SetPath<String, StringPath> federations = this.<String, StringPath>createSet("federations", String.class, StringPath.class, PathInits.DIRECT2);

    public final eu.h2020.symbiote.model.cim.QLocation locatedAt;

    public final ArrayPath<double[], Double> locationCoords = createArray("locationCoords", double[].class);

    public final StringPath platformId = createString("platformId");

    public final StringPath resourceType = createString("resourceType");

    public QFederatedResource(String variable) {
        this(FederatedResource.class, forVariable(variable), INITS);
    }

    public QFederatedResource(Path<? extends FederatedResource> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QFederatedResource(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QFederatedResource(PathMetadata metadata, PathInits inits) {
        this(FederatedResource.class, metadata, inits);
    }

    public QFederatedResource(Class<? extends FederatedResource> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.cloudResource = inits.isInitialized("cloudResource") ? new QCloudResource(forProperty("cloudResource"), inits.get("cloudResource")) : null;
        this.locatedAt = inits.isInitialized("locatedAt") ? new eu.h2020.symbiote.model.cim.QLocation(forProperty("locatedAt")) : null;
    }

}

