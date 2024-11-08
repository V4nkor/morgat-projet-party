export enum titleTypes {
  title = "title",
  subtitle = "subtitle",
  herotitle = "herotitle",
  herosubtitle = "herosubtitle",
}

export type titleType = keyof typeof titleTypes;
