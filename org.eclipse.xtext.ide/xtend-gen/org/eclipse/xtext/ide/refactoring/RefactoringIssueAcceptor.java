/**
 * Copyright (c) 2017, 2018 TypeFox GmbH (http://www.typefox.io) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.eclipse.xtext.ide.refactoring;

import org.apache.log4j.Logger;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.xtext.util.ITextRegion;

/**
 * @author koehnlein - Initial contribution and API
 * @since 2.13
 */
@SuppressWarnings("all")
public interface RefactoringIssueAcceptor {
  enum Severity {
    FATAL,
    
    ERROR,
    
    WARNING,
    
    INFO,
    
    OK;
  }
  
  void add(final RefactoringIssueAcceptor.Severity severity, final String message, final URI uri, final ResourceSet resourceSet);
  
  void add(final RefactoringIssueAcceptor.Severity severity, final String message, final URI resourceUri);
  
  void add(final RefactoringIssueAcceptor.Severity severity, final String message, final EObject element);
  
  void add(final RefactoringIssueAcceptor.Severity severity, final String message, final EObject element, final ITextRegion region);
  
  void add(final RefactoringIssueAcceptor.Severity severity, final String message, final Exception exc, final Logger log);
  
  void add(final RefactoringIssueAcceptor.Severity severity, final String message, final Object... params);
}
