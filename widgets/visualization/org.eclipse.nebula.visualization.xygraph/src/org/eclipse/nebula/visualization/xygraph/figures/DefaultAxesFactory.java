/*******************************************************************************
 * Copyright (c) 2015, 2017 Alex Clayton <Alex_Clayton_2000@yahoo.com> and others.
 *
 * This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License 2.0
 * which accompanies this distribution, and is available at
 * https://www.eclipse.org/legal/epl-2.0/
 * 
 * SPDX-License-Identifier: EPL-2.0
 ******************************************************************************/

package org.eclipse.nebula.visualization.xygraph.figures;

import org.eclipse.nebula.visualization.xygraph.linearscale.AbstractScale.LabelSide;
import org.eclipse.nebula.visualization.xygraph.linearscale.LinearScale.Orientation;

/**
 * Default {@link IAxesFactory} just produces standard {@link Axis}
 * 
 * @author Alex Clayton
 * @author Baha El-Kassaby - use IXYGraph static strings
 *
 */
public class DefaultAxesFactory implements IAxesFactory {

	@Override
	public Axis createXAxis() {
		Axis newAxis = new Axis(IXYGraph.X_AXIS, false);
		newAxis.setOrientation(Orientation.HORIZONTAL);
		newAxis.setTickLabelSide(LabelSide.Primary);
		return newAxis;
	}

	@Override
	public Axis createYAxis() {
		Axis newAxis = new Axis(IXYGraph.Y_AXIS, true);
		newAxis.setOrientation(Orientation.VERTICAL);
		newAxis.setTickLabelSide(LabelSide.Primary);
		newAxis.setAutoScaleThreshold(0.1);
		return newAxis;
	}

}
