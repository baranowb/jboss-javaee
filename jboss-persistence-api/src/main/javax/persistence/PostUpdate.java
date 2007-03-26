/* $Id: PostUpdate.java 11282 2007-03-14 22:05:59Z epbernard $
 * JBoss Inc
 *
 * Distributable under LGPL license.
 * See terms of license at gnu.org.
 */

package javax.persistence;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;


/**
 * Is used to specify callback methods for the corresponding lifecycle event. This annotation may be applied to
 * methods of an entity class, a mapped superclass, or a callback listener class.
 *
 * @author <a href="mailto:bill@jboss.org">Bill Burke</a>
 */
@Target({ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
public @interface PostUpdate {
}