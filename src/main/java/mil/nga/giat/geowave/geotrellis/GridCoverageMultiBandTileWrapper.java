package mil.nga.giat.geowave.geotrellis;

import geotrellis.raster.ArrayMultiBandTile;

import org.geotools.coverage.grid.GridCoverage2D;

public class GridCoverageMultiBandTileWrapper extends
		ArrayMultiBandTile
{

	public GridCoverageMultiBandTileWrapper(
			final GridCoverage2D gridCoverage ) {
		super(
				GeoTrellisUtils.getSingleBandTileArray(gridCoverage));
	}

}
