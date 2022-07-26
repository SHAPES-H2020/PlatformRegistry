package eu.h2020.symbiote.security.accesspolicies.common;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;


/**
 * QIAccessPolicySpecifier is a Querydsl query type for IAccessPolicySpecifier
 */
@Generated("com.querydsl.codegen.EmbeddableSerializer")
public class QIAccessPolicySpecifier extends BeanPath<IAccessPolicySpecifier> {

    private static final long serialVersionUID = -302189086L;

    public static final QIAccessPolicySpecifier iAccessPolicySpecifier = new QIAccessPolicySpecifier("iAccessPolicySpecifier");

    public final EnumPath<AccessPolicyType> policyType = createEnum("policyType", AccessPolicyType.class);

    public QIAccessPolicySpecifier(String variable) {
        super(IAccessPolicySpecifier.class, forVariable(variable));
    }

    public QIAccessPolicySpecifier(Path<? extends IAccessPolicySpecifier> path) {
        super(path.getType(), path.getMetadata());
    }

    public QIAccessPolicySpecifier(PathMetadata metadata) {
        super(IAccessPolicySpecifier.class, metadata);
    }

}

