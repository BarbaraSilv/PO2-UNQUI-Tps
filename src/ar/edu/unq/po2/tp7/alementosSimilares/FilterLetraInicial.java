package ar.edu.unq.po2.tp7.alementosSimilares;

public class FilterLetraInicial extends Filter {
	@Override
	public WikipediaPage isSimilar(WikipediaPage originalPage, WikipediaPage pageToCompare) {
		if (originalPage.getTitle().charAt(0) == pageToCompare.getTitle().charAt(0)) {
			return pageToCompare;
		}else {
			return null;
		}
	}

}
