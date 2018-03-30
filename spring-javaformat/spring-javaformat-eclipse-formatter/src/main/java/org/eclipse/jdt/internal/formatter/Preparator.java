/*
 * Copyright 2012-2016 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.eclipse.jdt.internal.formatter;

import org.eclipse.jdt.core.dom.ASTNode;

/**
 * Strategy interface used by {@link ExtendedCodeFormatter} to allow additional code
 * formatting.
 *
 * @author Phillip Webb
 */
public interface Preparator {

	/**
	 * Apply the preparator.
	 * @param tokenManager the token manager
	 * @param astRoot the AST root node
	 */
	void apply(TokenManager tokenManager, ASTNode astRoot);

}
