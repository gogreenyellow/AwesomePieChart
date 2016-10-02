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

import android.graphics.PointF;

class MathUtils {

    public static PointF getPoint(float centerX, float centerY, float distance, float degrees) {
        return new PointF(
                getPointX(centerX, distance, degrees),
                getPointY(centerY, distance, degrees));
    }

    public static float getPointX(float centerX, float distance, float degrees) {
        return (float) (centerX + distance * Math.sin(-degrees * Math.PI / 180 + Math.PI / 2));
    }

    public static float getPointY(float centerY, float distance, float degrees) {
        return (float) (centerY + distance * Math.cos(-degrees * Math.PI / 180 + Math.PI / 2));
    }

}
