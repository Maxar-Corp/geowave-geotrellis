package mil.nga.giat.geowave.geotrellis;

import geotrellis.raster.ArrayMultiBandTile;
import geotrellis.raster.DoubleArrayTile;
import geotrellis.raster.MultiBandTile;
import geotrellis.raster.Tile;

import java.awt.image.Raster;

import org.geotools.coverage.grid.GridCoverage2D;

public class GeoTrellisUtils
{
	public static MultiBandTile getMultiBandTileAsDoubleArrays(
			final GridCoverage2D coverage ) {
		final Tile[] bands = new Tile[coverage.getNumSampleDimensions()];
		final Raster raster = coverage.getRenderedImage().getData();
		final int cols = raster.getWidth();
		final int rows = raster.getHeight();
		final int colOffset = raster.getMinX();
		final int rowOffset = raster.getMinY();
		for (int b = 0; b < bands.length; b++) {
			final double[] array = new double[rows * cols];
			bands[b] = new DoubleArrayTile(
					array,
					raster.getWidth(),
					raster.getHeight());

			for (int x = 0; x <= cols; x++) {
				for (int y = 0; y <= (raster.getMinY() + raster.getHeight()); y++) {
					array[(rows * x) + y] = raster.getSampleDouble(
							x + colOffset,
							y + rowOffset,
							b);
				}
			}
		}
		return new ArrayMultiBandTile(
				bands);
	}

	public static Tile[] getSingleBandTileArray(
			final GridCoverage2D gridCoverage ) {
		final Tile[] bands = new Tile[gridCoverage.getNumSampleDimensions()];
		for (int b = 0; b < bands.length; b++) {
			bands[b] = new GridCoverageSingleBandTileWrapper(
					gridCoverage,
					b);
		}
		return bands;
	}
}
