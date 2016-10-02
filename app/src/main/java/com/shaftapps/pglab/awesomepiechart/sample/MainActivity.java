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
package com.shaftapps.pglab.awesomepiechart.sample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.shaftapps.pglab.awesomepiechart.sample.R;

import com.shaftapps.pglab.awesomepiechart.AwesomePieChart;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Dummy data
        AwesomePieChart awesomePieChart = (AwesomePieChart) findViewById(R.id.pie_chart);
        awesomePieChart.addSlice(new AwesomePieChart.Slice(
                getResources().getColor(R.color.slice_color_1), 230f,
                getResources().getDrawable(R.drawable.ic_test_pear)));
        awesomePieChart.addSlice(new AwesomePieChart.Slice(
                getResources().getColor(R.color.slice_color_2), 420f,
                getResources().getDrawable(R.drawable.ic_test_croassoint)));
        awesomePieChart.addSlice(new AwesomePieChart.Slice(
                getResources().getColor(R.color.slice_color_3), 350f,
                getResources().getDrawable(R.drawable.ic_test_lime)));
    }
}
