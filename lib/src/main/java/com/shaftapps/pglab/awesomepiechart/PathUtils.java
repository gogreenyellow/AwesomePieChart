/**
 * Copyright 2016 Paulina Glab
 * <p>
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * <p>
 * http://www.apache.org/licenses/LICENSE-2.0
 * <p>
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.shaftapps.pglab.awesomepiechart;

import android.graphics.Path;
import android.graphics.RectF;

class PathUtils {

    public static Path getSolidArcPath(Path solidArcPath,
                                       RectF outerCircleBounds, RectF innerCircleBounds,
                                       float startAngle, float sweepAngle) {
        solidArcPath.reset();

        // Move to start point
        float startX = MathUtils.getPointX(
                innerCircleBounds.centerX(),
                innerCircleBounds.width() / 2f,
                startAngle);
        float startY = MathUtils.getPointY(
                innerCircleBounds.centerY(),
                innerCircleBounds.height() / 2f,
                startAngle);
        solidArcPath.moveTo(startX, startY);


        // Add inner hole arc
        solidArcPath.addArc(innerCircleBounds, startAngle, sweepAngle);


        // Line from inner to outer arc
        solidArcPath.lineTo(
                MathUtils.getPointX(
                        outerCircleBounds.centerX(),
                        outerCircleBounds.width() / 2f,
                        startAngle + sweepAngle),
                MathUtils.getPointY(
                        outerCircleBounds.centerY(),
                        outerCircleBounds.height() / 2f,
                        startAngle + sweepAngle));

        // Add outer arc
        solidArcPath.addArc(outerCircleBounds, startAngle + sweepAngle, -sweepAngle);

        // Close (drawing last line and connecting arcs)
        solidArcPath.lineTo(startX, startY);

        return solidArcPath;
    }
}
