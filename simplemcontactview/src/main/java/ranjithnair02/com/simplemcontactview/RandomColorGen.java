/*
 * Copyright 2015 Ranjith
 * <p/>
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * <p/>
 * http://www.apache.org/licenses/LICENSE-2.0
 * <p/>
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.*
 */
package ranjithnair02.com.simplemcontactview;


import java.util.Random;

class RandomColorGen {
    private static Random rand;
    private static String col[] = new String[]{"#e51c23", "#e91e63", "#9c27b0", "#673ab7", "#3f51b5", "#5677fc",
            "#03a9f4", "#00bcd4", "#009688", "#259b24", "#8bc34a", "#cddc39", "#ffeb3b", "#ffc107",
            "#ff9800", "#ff5722", "#795548", "#9e9e9e", "#607d8b", "#000000", "#DD2C00", "#FF3D00", "#BF360C",
            "#3E2723", "#212121", "#FFD600", "#E65100", "#F57F17", "#FFAB00", "#AEEA00", "#64DD17", "#827717", "#33691E",
            "#1B5E20", "#00B8D4", "#0091EA", "#01579B", "#006064", "#004D40", "#6200EA", "#304FFE", "#0D47A1", "#1A237E",
            "#311B92", "#D50000", "#4A148C", "#880E4F", "#B71C1C"};


    static String init() {
        rand = new Random();
        return col[rand.nextInt(col.length - 1)];

    }
}
