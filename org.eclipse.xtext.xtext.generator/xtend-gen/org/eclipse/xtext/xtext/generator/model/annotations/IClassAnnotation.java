/**
 * Copyright (c) 2015, 2017 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.eclipse.xtext.xtext.generator.model.annotations;

import java.lang.annotation.Repeatable;
import org.eclipse.xtext.xtext.generator.XtextGenerator;
import org.eclipse.xtext.xtext.generator.model.JavaFileAccess;
import org.eclipse.xtext.xtext.generator.model.TypeReference;

/**
 * Class annotations can be added to the {@link XtextGenerator} workflow component in order
 * to configure specific Java annotations to be added to each generated class.
 * <br/><br/>
 * Make sure that you implement {@link Object#equals(Object)} and {@link Object#hashCode()} to fulfill following contract
 * <ul>
 * 	<li>If the underlying Annotation is {@link Repeatable} then the methods should behave like in {@link Object}.</li>
 * 	<li>If the underlying Annotation is NOT {@link Repeatable} then {@link Object#equals(Object)} should return true for all instances and {@link Object#hashCode()} should return the same value for all instances</li>
 * </ul>
 */
@SuppressWarnings("all")
public interface IClassAnnotation {
  /**
   * Convert the class annotation to a string suitable for use in Java code generation.
   */
  CharSequence generate();
  
  /**
   * Determine whether this annotation should be applied to the given Java file.
   */
  boolean appliesTo(final JavaFileAccess javaFile);
  
  /**
   * Return the qualified name of the annotation interface for use in import declarations,
   * or {@code null} if no import is required.
   */
  TypeReference getAnnotationImport();
}
